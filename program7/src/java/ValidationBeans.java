//Programmer: Abdullah Alfouzan
//Class: Java
//Instructor: Langhals
//Due Date: 04/11/2012
//Assenment: Program 7

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validationBean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import java.util.TreeSet;
import java.util.Set;
import java.io.Serializable;
/**
 *
 * @author alfouzana
 */
@ManagedBean (name="validationBean")
@SessionScoped
public class ValidationBeans implements Serializable {

    private String firstName;
    private String lastName;
    private String ssn;
    private double tax =0.0;
 
    //private double[] tax = new double[20];

    
    private Set <String> Tax = new TreeSet<String>();
    private Set <String> SSN = new TreeSet<String>();
    public int getSize()
    {
        return Tax.size();
    }
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setFirstName(String Name)
    {
        this.firstName = Name;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String Name)
    {
       this.lastName = Name;
    }
    public double getTax()
    {
        return tax;
    }
    public void setTax(double tax)
    {
        TaxCalc(tax);
        this.tax = tax;
    }
    public void setSSN(String SSun)
    {
        setSSNs(SSun);
        this.ssn = SSun;
    }
    public String getSSN()
    {
        return ssn;
    }
    public String[] getSSNs()
    {
        return SSN.toArray(new String[SSN.size()]);
    }
    public void setSSNs(String SSnum)
    {
        SSN.add(SSnum);
    }
    public void TaxCalc(double money)
    {
        
        
        if(money < 30000)
            tax = money* 0.15;
        else if (money > 30000 && money <= 60000)
            tax = money* 0.25;
        else if (money > 60000)
            tax = money * .33;
        
        setTaxes(tax);
    }

    public void setTaxes(double tax)
    {
        Tax.add(Double.toString(tax));
    }
    public String[] getResults()
    {
        return Tax.toArray(new String[Tax.size()]);
    }

    
}

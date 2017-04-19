import java.util.*;

public class PojoEx
{
  public static String employeeName;
  private static int employeeId;
  protected static String emailID;
  private static String address;

  public PojoEx()
  {

  }

  public String getName() {
		return employeeName;
	}

	public void setName(String employeeName) {
		this.employeeName = employeeName;
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  public String getEmail() {
    return emailID;
  }

  public void setEmail(String emailID) {
    this.emailID = emailID;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String toString() {
		String result = "Employee Name: " + getName() + "\n";
		result += "Employee ID: " + getEmployeeId() + "\n";
		result += "Email ID: " + getEmail() + "\n";
		result += "Address: " + getAddress() + "\n";
		return result;
	}


public static void main(String ar[])
{
  PojoEx po = new PojoEx();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter name :");
  employeeName = sc.nextLine();
  po.setName(employeeName);

  System.out.println("Enter ID:");
  employeeId = Integer.parseInt(sc.nextLine());
  po.setEmployeeId(employeeId);

  System.out.println("Enter EmailID:");
  emailID = sc.nextLine();
  po.setEmail(emailID);

  System.out.println("Enter Address:");
  address = sc.nextLine();
  po.setAddress(address);

  System.out.println(po);
}
}

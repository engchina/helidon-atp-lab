package io.helidon.atp.lab.entity;

public class Employee {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMPLOYEE.EMPLOYEE_ID
     *
     * @mbg.generated Thu May 16 05:04:08 EDT 2019
     */
    private String employeeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMPLOYEE.FIRST_NAME
     *
     * @mbg.generated Thu May 16 05:04:08 EDT 2019
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMPLOYEE.LAST_NAME
     *
     * @mbg.generated Thu May 16 05:04:08 EDT 2019
     */
    private String lastName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMPLOYEE.EMPLOYEE_ID
     *
     * @return the value of EMPLOYEE.EMPLOYEE_ID
     *
     * @mbg.generated Thu May 16 05:04:08 EDT 2019
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMPLOYEE.EMPLOYEE_ID
     *
     * @param employeeId the value for EMPLOYEE.EMPLOYEE_ID
     *
     * @mbg.generated Thu May 16 05:04:08 EDT 2019
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMPLOYEE.FIRST_NAME
     *
     * @return the value of EMPLOYEE.FIRST_NAME
     *
     * @mbg.generated Thu May 16 05:04:08 EDT 2019
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMPLOYEE.FIRST_NAME
     *
     * @param firstName the value for EMPLOYEE.FIRST_NAME
     *
     * @mbg.generated Thu May 16 05:04:08 EDT 2019
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMPLOYEE.LAST_NAME
     *
     * @return the value of EMPLOYEE.LAST_NAME
     *
     * @mbg.generated Thu May 16 05:04:08 EDT 2019
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMPLOYEE.LAST_NAME
     *
     * @param lastName the value for EMPLOYEE.LAST_NAME
     *
     * @mbg.generated Thu May 16 05:04:08 EDT 2019
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
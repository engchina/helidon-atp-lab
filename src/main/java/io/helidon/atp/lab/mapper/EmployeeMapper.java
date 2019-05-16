package io.helidon.atp.lab.mapper;

import io.helidon.atp.lab.entity.Employee;
import io.helidon.atp.lab.entity.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.cdi.Mapper;

@Mapper
public interface EmployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEE
     *
     * @mbg.generated Thu May 16 05:04:08 EDT 2019
     */
    long countByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEE
     *
     * @mbg.generated Thu May 16 05:04:08 EDT 2019
     */
    int deleteByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEE
     *
     * @mbg.generated Thu May 16 05:04:08 EDT 2019
     */
    int insert(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEE
     *
     * @mbg.generated Thu May 16 05:04:08 EDT 2019
     */
    int insertSelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEE
     *
     * @mbg.generated Thu May 16 05:04:08 EDT 2019
     */
    List<Employee> selectByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEE
     *
     * @mbg.generated Thu May 16 05:04:08 EDT 2019
     */
    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEE
     *
     * @mbg.generated Thu May 16 05:04:08 EDT 2019
     */
    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);
}
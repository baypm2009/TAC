package com.lee.tac.mapper;

import com.lee.tac.model.TestcaseStatus;

import java.util.List;

public interface TestcaseStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_status
     *
     * @mbg.generated Mon Apr 09 13:54:25 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_status
     *
     * @mbg.generated Mon Apr 09 13:54:25 CST 2018
     */
    int insert(TestcaseStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_status
     *
     * @mbg.generated Mon Apr 09 13:54:25 CST 2018
     */
    int insertSelective(TestcaseStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_status
     *
     * @mbg.generated Mon Apr 09 13:54:25 CST 2018
     */
    TestcaseStatus selectByPrimaryKey(Integer id);

    List<TestcaseStatus> selectAllStatus();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_status
     *
     * @mbg.generated Mon Apr 09 13:54:25 CST 2018
     */
    int updateByPrimaryKeySelective(TestcaseStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_status
     *
     * @mbg.generated Mon Apr 09 13:54:25 CST 2018
     */
    int updateByPrimaryKey(TestcaseStatus record);
}
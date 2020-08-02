package com.thoughtworks.springbootemployee.mapper;

import com.thoughtworks.springbootemployee.dto.CompanyRequest;
import com.thoughtworks.springbootemployee.model.Company;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CompanyMapperTest {
    @Test
    void should_get_company_when_mapper_given_companyRequest(){
        //given
        CompanyMapper companyMapper = new CompanyMapper();
        CompanyRequest companyRequest   = new CompanyRequest(8,"OOCL",emptyList());
        //when
        Company company = companyMapper.toCompany(companyRequest);
        //then
        assertEquals(companyRequest.getCompanyId(),company.getCompanyId());
        assertEquals(companyRequest.getCompanyName(),company.getCompanyName());
    }

    @Test
    void should_get_companyRequest_when_mappe_given_company(){
        //given
        CompanyMapper companyMapper = new CompanyMapper();
        Company company = new Company(8,"OOCL",emptyList());
        //when
        CompanyRequest companyRequest = companyMapper.toCompanyRequest(company);
        //then
        assertEquals(company.getCompanyId(),companyRequest.getCompanyId());
        assertEquals(company.getCompanyName(),companyRequest.getCompanyName());
    }
}

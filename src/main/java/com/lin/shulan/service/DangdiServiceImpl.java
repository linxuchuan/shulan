package com.lin.shulan.service;

import com.lin.shulan.entity.DangdiGentuan;
import com.lin.shulan.repository.GentuanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DangdiServiceImpl implements DangdiService{

    @Autowired
     private  GentuanRepository gentuanRepository;

    @Override
    public List<DangdiGentuan> getGentuanList(){
        List<DangdiGentuan> r = new ArrayList<DangdiGentuan>(gentuanRepository.findAll());
        return r;
    }


}

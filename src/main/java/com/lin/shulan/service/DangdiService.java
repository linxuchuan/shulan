package com.lin.shulan.service;




import com.lin.shulan.entity.DangdiGentuan;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DangdiService {

    List<DangdiGentuan> getGentuanList();

}

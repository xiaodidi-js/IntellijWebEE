package com.codeing.Commit;

import com.codeing.Interface.*;
import com.codeing.db.NavInfo;

import java.util.*;
import com.codeing.bean.*;

public class NavServiceImpl implements MyInterface {

    public List<Nav> getAllStudents() {
        return NavInfo.getAllStudents();
    }

}

package com.colinf.test.src;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import com.colinf.code.src.*;
import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/** 
 * @author ColinF
 *  */

 public class ListclientExampleTest {
     /** 
      * Test method for ListClientExample Class
      */
      @Test
      public void testListClientExample(){
      ListClientExample lce = new ListClientExample();
      List list = lce.getList();
      assertThat(list, instanceOf(ArrayList.class));
      }
 }
package com.qainfotech.test2.Test2;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.qainfotech.test2.Test2.*;

import java.io.IOException;
import java.util.*;


public class NewTest {
  @Test(priority=1)
  public static void f() {
	  
	 
	      	  App obj = new App();
	          ArrayList <String> inputlist = new ArrayList<String>();
	          inputlist.add("abc");
	          inputlist.add("hello");
	          inputlist.add("apple");
	          ArrayList <String> outputlist = new ArrayList<String>();
	          outputlist.add("hello");
	          outputlist.add("apple");
	          List l = obj.check(inputlist);
              Assert.assertEquals(l,outputlist);
             
	          
  }
  
  @Test(priority=2)
  public static void s() {
	  
	  App obj = new App();
	  ArrayList <String> outputlist = new ArrayList<String>();
	  ArrayList <String> inputlist = new ArrayList<String>();
	  inputlist.add("abc");
	  inputlist.add("abgc");
      inputlist.add("hello");
      inputlist.add("lion");
      inputlist.add("apple");
      List h=obj.check(inputlist);
      outputlist.add("hello");
      outputlist.add("apple");
      Assert.assertEquals("ram",outputlist,"Failed this case");
      
}
      
	  
  
	      
	      
	  }

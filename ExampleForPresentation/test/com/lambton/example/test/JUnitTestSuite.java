/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton.example.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author macstudent
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    EncryptionTest.class,
    EncryptionTestWithDatabase.class
})
public class JUnitTestSuite {
    
}

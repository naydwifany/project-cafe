/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.User;
/**
 *
 * @author nayla
 */
public class UserDao {
    
    public static void save(User user){
        String query = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobileNumber()+"','"+user.getAddress()+"','"+user.getPassword()+"','"+user.getSecurityQuestion()+"','"+user.getAnswer()+"','false')";
        DbOperations.setDateOrDelete(query, "Registered successfully! Wait for Admin Approval!");
    }
    
}

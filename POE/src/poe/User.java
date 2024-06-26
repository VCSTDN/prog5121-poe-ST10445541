/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe;

/**
 *
 * @author byron
 */
public class User {
        private String username;
        private String password;
        private String firstName;
        private String lastName;

        public User(String username, String password, String firstName, String lastName) {
            this.username = username;
            this.password = password;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getPassword() {
            return password;
        }

        public String getFirstName() {
            return firstName;
        }
    }

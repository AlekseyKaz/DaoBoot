//package com.example.DaoBoot.models;
//
//import org.springframework.security.core.GrantedAuthority;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//@Table(name = "roles")
//public class Role implements GrantedAuthority {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(name = "role")
//    private String role;
//
//    @Column(name = "users")
//    @ManyToMany
//    @JoinTable(name = "users_roles",
//            joinColumns = @JoinColumn(name = "role_id"),
//            inverseJoinColumns = @JoinColumn(name = "user_id"))
//    private Set<User> users;
//
//    public Role() {
//    }
//
//    public Role(String role) {
//        this.role = role;
//    }
//
//    public Role(int id, String role) {
//        this.id = id;
//        this.role = role;
//    }
//
//    public Role(int id, String role, Set<User> users) {
//        this.id = id;
//        this.role = role;
//        this.users = users;
//    }
//
//    public Role(String role, Set<User> users) {
//        this.role = role;
//        this.users = users;
//    }
//
//    public Set<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Set<User> users) {
//        this.users = users;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    @Override
//    public String getAuthority() {
//        return getRole();
//    }
//}

package org.csci4448.controllers;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Accounts", schema = "PlaceDB", catalog = "")
public class AccountsEntity {
    private int accountId;
    private String userName;
    private String password;
    private String email;

    @Id
    @Column(name = "accountID", nullable = false)
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "userName", nullable = true, length = 20)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 40)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountsEntity that = (AccountsEntity) o;
        return accountId == that.accountId &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(password, that.password) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(accountId, userName, password, email);
    }
}

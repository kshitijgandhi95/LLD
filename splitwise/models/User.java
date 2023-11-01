package splitwise.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import splitwise.services.GroupService;

public class User {
    private String id;
    private String name;
    private String phoneNumber;
    private String password;
    private List<Group> groups;
    private List<Expense> expenses;

    //can add validators
    public User (String name, String phoneNumber, String password) {
        UUID id = UUID. randomUUID();
        this.id = id.toString();
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.expenses = new ArrayList<>();
    }

    public String getId () {
        return this.id;
    }

    public String getName () {
        return this.name;
    }

    public String getPhoneNumber () {
        return this.phoneNumber;
    }

    public String getPassword () {
        return this.password;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public void createGroup (String name, String description) {
        GroupService grp = GroupService.groupService();
        grp.createGroup(this, name, description);;
    }

    public List<Expense> getExpenses () {
        return this.expenses;
    }

    public List<Group> getGroups () {
        return this.groups;
    }

    public void addExpense (Expense e) {
        expenses.add(e);
    }

    // public boolean addMember (User admin, User member) {
        
    // }
}
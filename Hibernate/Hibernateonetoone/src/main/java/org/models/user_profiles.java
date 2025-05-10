package org.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "user_profiles")
public class user_profiles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="profile_id")
    int id;
    String profile_data;
    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private users users;

    public users getUsers() {
        return users;
    }

    public void setUsers(users users) {
        this.users = users;
    }



    public user_profiles() {
    }

    public user_profiles(String profile_data,users users) {
        this.profile_data = profile_data;
        this.users=users;
    }
    public String getProfile_data() {
        return profile_data;
    }

    public void setProfile_data(String profile_data) {
        this.profile_data = profile_data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

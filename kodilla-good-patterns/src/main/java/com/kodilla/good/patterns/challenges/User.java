package com.kodilla.good.patterns.challenges;

public class User {
    private String name, surname;
    private final String userId;

    User (String name, String surname, String userId) {
        this.name = name;
        this.surname = surname;
        this.userId = userId;
    }

    public String getName () {
        return name;
    }

    public String getSurname () {
        return surname;
    }

    public String getUserId () {
        return userId;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getName() != null ? !getName().equals(user.getName()) : user.getName() != null) return false;
        if (getSurname() != null ? !getSurname().equals(user.getSurname()) : user.getSurname() != null) return false;
        return getUserId() != null ? getUserId().equals(user.getUserId()) : user.getUserId() == null;
    }

    @Override
    public int hashCode () {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + (getUserId() != null ? getUserId().hashCode() : 0);
        return result;
    }
}

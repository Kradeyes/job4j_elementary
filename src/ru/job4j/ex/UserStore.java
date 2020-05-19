package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = new User("Test", false);
        for (int i = 0; i < users.length; i++) {
            if (login.equals(users[i].getUsername())) {
                rsl = users[i];
            }
        }
        if (rsl.getUsername().equals("Test")) {
            throw new UserNotFoundException("User not found");
        } else {
            return rsl;
        }
    }
    public static boolean validate(User user) throws UserInvalidException {
         if (user.getUsername().length() < 3 || !user.isValid()) {
             throw new UserInvalidException("Not valid user");
         }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
        }
    }

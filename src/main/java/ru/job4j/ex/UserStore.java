package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User x: users) {
            if (x.getUsername().equals(login)) {
                rsl = x;
                break;
            }
        }
         if (rsl == null) {
             throw new UserNotFoundException("User not found");
         }
        return rsl;
        }

    public static boolean validate(User user) throws UserInvalidException {
         if (!user.isValid()) {
             throw new UserInvalidException("Not valid user");
         } else if (user.getUsername().length() < 3) {
             throw new UserInvalidException("The number of characters in the username field is less than 3");
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

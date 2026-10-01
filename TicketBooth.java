public class TicketBooth {

    private String showName;
    private int showHour;
    private int seatsLeft;

    // Creates a booth selling one showing.
    // to-do: store all three values in the instance variables
    public TicketBooth(String newShowName, int newShowHour, int newSeatsLeft) {
        showName = newShowName;
        showHour = newShowHour;
        seatsLeft = newSeatsLeft;
    }

    // Returns the name of the show.
    // to-do: implement getShowName
    public String getShowName() {
        return showName;
    }

    // Returns the hour the show starts, on a 24-hour clock.
    // to-do: implement getShowHour
    public int getShowHour() {
        return showHour;
    }

    // Returns how many seats are still unsold.
    // to-do: implement getSeatsLeft
    public int getSeatsLeft() {
        return seatsLeft;
    }

    // ---------- Write these methods ----------

    // Returns "child", "student", "adult", or "senior" for one age.
    // to-do: implement priceCategory
    public String priceCategory(int age) {
        if (age <= 12) {
            return "child";
        }
        else if (13 <= age && age <= 17) {
            return "student";
        }
        else if (18 <= age && age <= 64) {
            return "adult";
        }
        else {
            return "senior";
        }
    }

    // Returns the price in whole dollars after the matinee and member discounts.
    // to-do: implement ticketPrice
    public int ticketPrice(int age, boolean isMember) {
        if (isMember && showHour <= 16 && showHour >= 12) {
            if (age <= 12) {
                return 6;
            }
            else if (13 <= age && age <= 17) {
                return 7;
            }
            else if (18 <= age && age <= 64) {
                return 13;
            }
            else {
                return 8;
            }
        }
        else if (!isMember && showHour <= 16 && showHour >= 12) {
            if (age <= 12) {
                return 8;
            }
            else if (13 <= age && age <= 17) {
                return 9;
            }
            else if (18 <= age && age <= 64) {
                return 15;
            }
            else {
                return 10;
            }
        }
        else {
            if (age <= 12) {
                return 8;
            }
            else if (13 <= age && age <= 17) {
                return 12;
            }
            else if (18 <= age && age <= 64) {
                return 18;
            }
            else {
                return 10;
            }
        }
    }

    // ---------- Each method below compiles and has exactly one bug ----------

    // Returns "morning" before 12, "matinee" from 12 through 16, and "evening" from 17 on.
    public String showtimeLabel() {
        if (showHour >= 12 && showHour <= 16) {
            return "matinee";
        } else if (showHour >= 17) {
            return "evening";
        } else {
            return "morning";
        }
    }

    // Returns "red" for 12 and under, "yellow" for 13 through 17, and "green" for 18 and up.
    public String wristband(int age) {
        String color = "green";
        if (age <= 12) {
            color = "red";
        }
        if (age <= 17 && age >= 13) {
            color = "yellow";
        }
        return color;
    }

    // Returns 2 for a member and 0 for anyone else.
    public int memberDiscount(boolean isMember) {
        if (isMember) {
            return 2;
        }
        return 0;
    }

    // ---------- Write these with guard clauses ----------

    // Stores the new hour only when it is 10 through 23.
    // to-do: implement setShowHour
    public void setShowHour(int newShowHour) {
        if (newShowHour < 10) {
            System.out.println("Invalid show hour: " + newShowHour);
            return;
        }
        else if (newShowHour > 23) {
            System.out.println("Invalid show hour: " + newShowHour);
            return;
        }
        showHour = newShowHour;
    }

    // Stores the new count only when it is 0 through 200.
    // to-do: implement setSeatsLeft
    public void setSeatsLeft(int newSeatsLeft) {
        if (newSeatsLeft < 0) {
            System.out.println("Invalid seat count: " + newSeatsLeft);
            return;
        }
        else if (newSeatsLeft > 200) {
            System.out.println("Invalid seat count: " + newSeatsLeft);
            return;
        }
        seatsLeft = newSeatsLeft;
    }

    // Stores the new name only when it is not null and not empty.
    // to-do: implement setShowName
    public void setShowName(String newShowName) {
        if (newShowName == null) {
            System.out.println("Invalid show name");
            return;
        }
        else if (newShowName.length() == 0) {
            System.out.println("Invalid show name");
            return;
        }
        showName = newShowName;
    }

    // Sells the seats when the group fits. Otherwise prints why and changes nothing.
    // to-do: implement sell
    public void sell(int groupSize) {
        if (groupSize < 1) {
            System.out.println("Invalid group size: " + groupSize);
            return;
        }
        else if (groupSize > seatsLeft) {
            System.out.println("Not enough seats for " + groupSize);
            return;
        }
        seatsLeft -= groupSize;
    }

    public void refund(int groupSize) {
        if (groupSize < 1) {
            System.out.println("Invalid group size: " + groupSize);
            return;
        }
        else if (groupSize + seatsLeft > 200) {
            int total = groupSize + seatsLeft;
            System.out.println("Too many seats: " + total);
            return;
        }
        seatsLeft += groupSize;
    }
}
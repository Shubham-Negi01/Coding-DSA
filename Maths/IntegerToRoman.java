package Maths;

public class IntegerToRoman {
    public String intToRoman(int num) {

        StringBuilder roman = new StringBuilder();
        int place = 1;
        while (num != 0) {
            StringBuilder temp = new StringBuilder();
            int r = num % 10;
            switch (place) {
                case 1: {
                    if (r >= 1 && r <= 3) {
                        for (int i = 0; i < r; i++) {
                            temp.append("I");
                        }
                    } else if (r >= 4 && r <= 8) {
                        if (r == 4) {
                            temp.append("I");
                        }
                        temp.append("V");
                        if (r >= 6 && r <= 8) {
                            for (int i = 0; i < r - 5; i++) {
                                temp.append("I");
                            }
                        }
                    } else if (r == 9) {
                        temp.append("IX");
                    }
                    break;
                }

                case 2: {
                    if (r >= 1 && r <= 3) {
                        for (int i = 0; i < r; i++) {
                            temp.append("X");
                        }
                    } else if (r >= 4 && r <= 8) {
                        if (r == 4) {
                            temp.append("X");
                        }
                        temp.append("L");
                        if (r >= 6 && r <= 8) {
                            for (int i = 0; i < r - 5; i++) {
                                temp.append("X");
                            }
                        }
                    } else if (r == 9) {
                        temp.append("XC");
                    }
                    break;
                }

                case 3: {
                    if (r >= 1 && r <= 3) {
                        for (int i = 0; i < r; i++) {
                            temp.append("C");
                        }
                    } else if (r >= 4 && r <= 8) {
                        if (r == 4) {
                            temp.append("C");
                        }
                        temp.append("D");
                        if (r >= 6 && r <= 8) {
                            for (int i = 0; i < r - 5; i++) {
                                temp.append("C");
                            }
                        }
                    } else if (r == 9) {
                        temp.append("CM");
                    }
                    break;
                }

                case 4: {
                    if (r >= 1 && r <= 3) {
                        for (int i = 0; i < r; i++) {
                            temp.append("M");
                        }
                    }
                    break;
                }
            }
            roman.insert(0, temp);

            place++;
            num /= 10;
        }

        return roman.toString();

    }
}

package Maths;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuffer longNum = new StringBuffer(a);
        StringBuffer shortNum = new StringBuffer(b);

        if (a.length() < b.length()) {
            longNum = new StringBuffer(b);
            shortNum = new StringBuffer(a);
        }
        longNum = longNum.reverse();
        shortNum = shortNum.reverse();

        System.out.println(shortNum + " " + longNum);

        StringBuffer result = new StringBuffer();

        char carry = '0';

        for (int i = 0; i < longNum.length(); i++) {
            if (i < shortNum.length()) {
                if (longNum.charAt(i) == '0' && shortNum.charAt(i) == '0') {
                    result.append(carry);
                    carry = '0';
                }

                else if (longNum.charAt(i) == '1' && shortNum.charAt(i) == '1') {
                    result.append(carry);
                    carry = '1';
                }

                else if (longNum.charAt(i) != shortNum.charAt(i)) {
                    if (carry == '1') {
                        result.append("0");
                        carry = '1';
                    } else {
                        result.append("1");
                        carry = '0';
                    }
                }

            } else {
                if (longNum.charAt(i) == '0') {
                    result.append(carry);
                    carry = '0';
                } else {
                    if (carry == '1') {
                        result.append("0");
                        carry = '1';
                    } else {
                        result.append("1");
                        carry = '0';
                    }
                }
            }
        }
        if (carry == '1')
            result.append(carry);
        return result.reverse().toString();

    }
}

class Main {
  public static void main(String[] args) {
    numberToWords(1450);
  }

  public static void numberToWords(int number) {
    int finalNum = reverse(number);
    int zeros = getDigitCount(number) - getDigitCount(finalNum);
    int lastDigit = 0;
    if (finalNum < 0) {
      System.out.println("Invalid Value");
    } else {
            if (finalNum == 0) {
              System.out.println("Zero");
            }
            System.out.println(finalNum);
            while (finalNum > 0) {
              lastDigit = finalNum%10;
            switch(lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            finalNum = finalNum/10;
            }
      for (int i = zeros; i > 0; i--) {
      System.out.println("Zero");
    }
      }
  }

  public static int reverse(int number) {
        int reversedNumber = number%10;
        int lastDigit = 0;
        while (number > 9 || number < -9) {
            number = number/10;
            lastDigit = number%10;
            reversedNumber = reversedNumber*10;
            reversedNumber+=lastDigit;
        }
    return reversedNumber;
    }
  
    public static int getDigitCount(int number) {
          if (number < 0) {
              return -1;
          }
          
          int digits = 1;
          while (number > 9) {
              digits++;
              number = number / 10;
          }
      return digits;
      }
}
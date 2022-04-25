package tdd;

public class TestDriller {
      public int product(int copies) {
          int price = 0;
          if (copies <= 4) price = copies * 2_000;

          if (copies >= 5 && copies <= 9) price = copies * 1_800;

          if (copies >= 10 && copies <= 29) price = copies * 1_600;

          if (copies >= 30 && copies <= 49) price = copies * 1_500;

          if (copies >= 50 && copies <= 99) price = copies * 1_300;

          if (copies >= 100 && copies <= 199) price = copies * 1_200;

          if (copies >= 200 && copies <= 499) price = copies * 1_100;

          if (copies >= 500) price = copies * 1_000;

          return price;
    }
}

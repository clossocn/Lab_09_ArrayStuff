package com.example.lab_09_arraystuff;
import java.util.Random;
public class Array {
        public static void main(String[] args) {

            int[] dataPoints = new int[100];

            Random random = new Random();
            for (int i = 0; i < dataPoints.length; i++) {
                dataPoints[i] = random.nextInt(100) + 1;
            }

            System.out.print("DataPoints: ");
            for (int i = 0; i < dataPoints.length; i++) {
                System.out.print(dataPoints[i]);
                if (i < dataPoints.length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();

            int userValue = SafeInput.getRangedInt("Enter an integer between 1 and 100: ", 1, 100);

            int count = 0;
            for (int value : dataPoints) {
                if (value == userValue) {
                    count++;
                }
            }
            System.out.println("The user's value was found " + count + " times in the array.");

            int userSearchValue = SafeInput.getRangedInt("Enter another integer between 1 and 100 to search for: ", 1, 100);

            int position = -1;
            for (int i = 0; i < dataPoints.length; i++) {
                if (dataPoints[i] == userSearchValue) {
                    position = i;
                    break;
                }
            }

            if (position != -1) {
                System.out.println("The value " + userSearchValue + " was found at array index " + position);
            } else {
                System.out.println("The value " + userSearchValue + " was not found in the array.");
            }

            int min = dataPoints[0];
            int max = dataPoints[0];

            for (int value : dataPoints) {
                if (value < min) {
                    min = value;
                }
                if (value > max) {
                    max = value;
                }
            }

            System.out.println("The minimum value in the array is: " + min);
            System.out.println("The maximum value in the array is: " + max);

            double average = getAverage(dataPoints);
            System.out.println("Average of dataPoints is: " + average);
        }

        public static double getAverage(int values[]) {
            int sum = 0;
            for (int value : values) {
                sum += value;
            }
            return (double) sum / values.length;
        }
    }


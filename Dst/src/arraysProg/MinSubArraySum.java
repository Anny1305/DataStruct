/*
 * Copyright 2021-present (c) Care.com, Inc.
 * 77 Fourth Avenue, 5th Floor Waltham, MA, 02451, U.S.A.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Care.com, Inc. ("Confidential Information").  You shall not disclose
 * such Confidential Information and shall use it only in accordance with
 * the terms of an agreement between you and CZen.
 */

package arraysProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created 18/01/21 5:18 PM
 *
 * @author Anny
 */
public class MinSubArraySum {

  public static void main(String[] args) {
    List l = Arrays.asList(1, 3, 5, 6, 4, 3);
    System.out.println(smallestSubarray(9, l));
    System.out.println(smallestSubarrayEff(9, l));
  }


  public static ArrayList<Integer> smallestSubarray(int sum, List<Integer> input) {
    int minLength = Integer.MAX_VALUE;
    ArrayList<Integer> res = new ArrayList();
    for (int i = 0; i < input.size(); i++) {
      int currSum = 0;
      ArrayList<Integer> out = new ArrayList();
      for (int j = i; j < input.size(); j++) {
        currSum += input.get(j);
        out.add(input.get(j));
        if (currSum > sum && minLength > (j - i + 1)) {
          minLength = (j - i + 1);
          res = out;
          break;
        }
      }
    }
    return res;
  }

  public static ArrayList<Integer> smallestSubarrayEff(int sum, List<Integer> input) {
    int minLength = Integer.MAX_VALUE;
    ArrayList<Integer> res = new ArrayList();
    ArrayList<Integer> temp = new ArrayList();

    int i, j;
    i = j = 0;
    int currSum =0;
    while (j < input.size()) {
      currSum += input.get(j);
      temp.add(input.get(j));
      while (currSum > sum && i<=j) {
        if (minLength > (j - i + 1)) {
          minLength = (j - i + 1);
          res = new ArrayList<>(temp);
        }
        currSum -= temp.remove(0);
        i++;
      }
      j++;
    }
    return res;
  }
}

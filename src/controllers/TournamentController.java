package controllers;

import models.Tournament;

import models.*;

public class TournamentController {

  public static void sortSelectionDesc(Tournament[] tournaments) {

    int n = tournaments.length;
    for (int i = 0; i < n - 1; i++) {

      int maxIndex = i;
      for (int j = i + 1; j < n; j++) {

        if (tournaments[j].getTotalStarterPoints() > tournaments[maxIndex].getTotalStarterPoints()) {
          maxIndex = j;
        }
      }
      Tournament temp = tournaments[i];
      tournaments[i] = tournaments[maxIndex];
      tournaments[maxIndex] = temp;
    }
  }

  public Tournament binarySearchByTotalStarterPointsFilaB(Tournament[] tournaments, int totalStarterPoints){

      int left = 0;
      int right = tournaments.length-1;

      while ( (left <= right)) {

        int mid = left + (right-left)/2;
        int midValue = tournaments[mid].getTotalStarterPoints();
        
        if (midValue == totalStarterPoints){
          System.out.println("torneo encontrado");
          return tournaments[mid];
        }else if (midValue > totalStarterPoints){

          left = mid +1 ;

        }else{
          right = mid -1;
        }
      }
    
  } return totalStarterPoints;

}

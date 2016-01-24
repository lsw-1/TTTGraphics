/*
package com.ludwigstralewiren.model;


*/
/**
 * Created by Ludwig on 1/18/2016.
 *//*

public class GameRules {


    //SPELARE 1 INITIERAS
    Player spelare1 = new Player( 'X', 1);


    //SPELARE 2 INITIERAS
    Player spelare2 = new Player( 'O', 2);



    //VARIABLER F�R LOOPEN
    int turn = 0;
    Player currentPlayer
            ;
    boolean continuePlaying = true;


    // METOD FÖR ATT HÅLLA SPELET RULLANDE �VER OMG�NGAR
    while(true){
        while(continuePlaying){


            //IF-SATS F�R ATT V�XLA MELLAN DE TV� SPELARENA
            if(turn
                    % 2 == 0){
                currentPlayer
                        = spelare1;
            } else {
                currentPlayer
                        = spelare2;
            }
            turn
                    ++;

            board.askPlayer(currentPlayer
                    .getMarker());
            System.out.print(board);

            if(board.kollaVinnare() == true){
                System.out.print("Grattis! " + currentPlayer
                        .getNamn() + " har vunnit!");
                continuePlaying = false;
                currentPlayer
                        .setVinster(1);
            }

            if(turn
                    == 9){
                System.out.print("Oavgjort!");
                continuePlaying = false;
            }
        }

        System.out.print(spelare1.getNamn() + " har " + spelare1.getVinster() + " vinster och "
                + spelare2.getNamn() + " har " + spelare2.getVinster() + " vinster \n");
        turn
                = 0;
        board.reset();
        continuePlaying = true;
        System.out.print("Ny turn" +
                "! \n");
        System.out.print(board);
}
*/

echo off
java -jar .\BDLCompiler.jar .\chess.bdl .\chess\
java -jar .\ABDLCompiler.jar .\matePastor.abdl .\chess\

java -jar .\BDLCompiler.jar .\sort.bdl .\Sort\
java -jar .\ABDLCompiler.jar .\bubbleSort.abdl .\Sort\

java -jar .\BDLCompiler.jar .\pawngame.bdl  .\pawnGame\

java -jar .\BDLCompiler.jar .\damas_chinesas.bdl .\damas\
java -jar .\ABDLCompiler.jar .\damasBots3vs3.abdl .\damas\
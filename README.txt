O projeto consiste em 2 linguagens,
uma para modelaçao de jogos de tabuleiro (bdl - Board Description Language) e 
outra para criaçao de jogadas sobre o jogo criado pela primeira(abdl - Auto bdl).
As gramaticas da bdl e abdl podem ser encontradas em 
BDL-Board-Description-Language/BDLCompilerSource/src/Board.g4 ou no link
https://github.com/Unn4m3DD/BDL-Board-Description-Language/blob/master/BDLCompilerSource/src/Board.g4
e
BDL-Board-Description-Language/ABDLCompilerSource/src/Compiler/Abdl.g4 ou no link
https://github.com/Unn4m3DD/BDL-Board-Description-Language/blob/master/ABDLCompilerSource/src/Compiler/Abdl.g4
respetivamente.

As documentações das linguagens estão disponiveis nos ficheiros 
README.md (bdl) e READMEABDL.md (abdl) ou nos links 
https://github.com/Unn4m3DD/BDL-Board-Description-Language/blob/master/README.md
https://github.com/Unn4m3DD/BDL-Board-Description-Language/blob/master/READMEABDL.md

Existe ainda um ficheiro com descriçao da abdl no caminho 
BDL-Board-Description-Language/ABDLCompilerSource/abdl_source_code_examples/language_description.txt
https://github.com/Unn4m3DD/BDL-Board-Description-Language/blob/master/ABDLCompilerSource/abdl_source_code_examples/language_description.txt

Os exemplos significativos para o uso pretendido das linguagens
podem ser encontrados na pasta StandaloneCompiler/.
Em escala crescente de complexidade:
pawngame.bdl < sort.bdl < chess.bdl < damas_chinesas.bdl
matePastor.abdl < bubbleSort.abdl < damasBot*.abdl

Ao correr o comando 
find . -type f -not -path '*/\.git/*' | grep -E "[a-zA-Z]\.[a]?bdl"
serão mostrados outros exemplos de codigo, a maioria utilizado para testes
automatizados dos visitors de deteçao de erros semanticos e do visitor gerador de 
codigo da abdl.

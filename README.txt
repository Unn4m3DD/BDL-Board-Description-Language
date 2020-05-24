O projeto consiste em 2 linguagens,
uma para modelação de jogos de tabuleiro (bdl - Board Description Language) e 
outra para criação de jogadas sobre o jogo criado pela primeira(abdl - Auto bdl).
As gramáticas da bdl e abdl podem ser encontradas em 
BDL-Board-Description-Language/BDLCompilerSource/src/Board.g4 ou no link
https://github.com/Unn4m3DD/BDL-Board-Description-Language/blob/master/BDLCompilerSource/src/Board.g4
e
BDL-Board-Description-Language/ABDLCompilerSource/src/Compiler/Abdl.g4 ou no link
https://github.com/Unn4m3DD/BDL-Board-Description-Language/blob/master/ABDLCompilerSource/src/Compiler/Abdl.g4
respetivamente.

As documentações das linguagens estão disponíveis nos ficheiros 
README.md (bdl) e READMEABDL.md (abdl) ou nos links 
https://github.com/Unn4m3DD/BDL-Board-Description-Language/blob/master/README.md
https://github.com/Unn4m3DD/BDL-Board-Description-Language/blob/master/READMEABDL.md

Existe ainda um ficheiro com descrição da abdl no caminho 
BDL-Board-Description-Language/ABDLCompilerSource/abdl_source_code_examples/language_description.txt
https://github.com/Unn4m3DD/BDL-Board-Description-Language/blob/master/ABDLCompilerSource/abdl_source_code_examples/language_description.txt

Os exemplos significativos para o uso pretendido das linguagens
podem ser encontrados na pasta StandaloneCompiler/.
Em escala crescente de complexidade:
pawngame.bdl < sort.bdl < chess.bdl < damas_chinesas.bdl
matePastor.abdl < bubbleSort.abdl < damasBot*.abdl

Ao correr o comando 
find . -type f -not -path '*/\.git/*' | grep -E "[a-zA-Z]\.[a]?bdl"
serão mostrados outros exemplos de código, a maioria utilizado para testes
automatizados dos visitors de deteção de erros semânticos e gerador de 
código da abdl.

Encorajamos ainda o teste dos compiladores na pasta StandaloneCompiler/
BDLCompiler.jar e ABDLCompiler.jar que já implementam as linguagens 
descritas nas gramáticas (os compiladores necessitam do jre 11 ou superior).
Os programas recompile.bat e sh compilam todos os programas para as 
respetivas pastas. O código gerado obedece à mais recente norma do js ES2020 e por isso 
apenas funciona quando em servidor. Recomendamos o uso do plugin "Live Server" do vscode
para o efeito. Para correr o código basta abrir o app.html respetivo num browser.
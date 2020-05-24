echo off
IF NOT "%1"=="" ant -f .\ABDLCompilerSource\abdlcompilersource.xml
IF NOT "%1"=="" ant -f .\BDLCompilerSource\bdlcompilersource.xml
copy .\ABDLCompilerSource\out\artifacts\ABDLCompilerSource_jar\ABDLCompilerSource.jar .\StandaloneCompiler\ABDLCompiler.jar
copy .\BDLCompilerSource\out\artifacts\BDLCompiler_jar\BDLCompiler.jar .\StandaloneCompiler\BDLCompiler.jar
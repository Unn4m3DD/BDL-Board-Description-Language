#!/bin/bash
if [ -z $0 ] 
then
ant -f ./ABDLCompilerSource/abdlcompilersource.xml
ant -f ./BDLCompilerSource/bdlcompilersource.xml
fi
cp ./BDLCompilerSource/out/artifacts/BDLCompiler_jar/BDLCompiler.jar ./StandaloneCompiler/BDLCompiler.jar
echo "BDL copiado"
cp ./ABDLCompilerSource/out/artifacts/ABDLCompilerSource_jar/ABDLCompilerSource.jar ./StandaloneCompiler/ABDLCompiler.jar
echo "ABDL copiado"
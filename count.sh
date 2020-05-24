find ./BDLCompilerSource/src -name '*.js' | xargs wc -l | grep total
find ./ABDLCompilerSource/src -name '*.js' | xargs wc -l
find . -name '*.*bdl' | xargs wc -l | grep total
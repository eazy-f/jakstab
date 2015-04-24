#!/bin/bash
JSCLASSPATH=lib/antlr.jar:lib/google-collect-1.0.jar:lib/javabdd-1.0b2.jar
case `uname` in
    CYGWIN*)
        JSCLASSPATH=`cygpath -p -d "$JSCLASSPATH"`
        ;;
    *)
esac
if [ ! -d bin ]; then mkdir bin; fi
javac -d bin/ `find -L src/ -name '*.java'` -cp ${JSCLASSPATH}
jar cf lib/jakstab.jar -C bin org
jar uf lib/jakstab.jar ssl/pentium.ssl ssl/simplifications.ssl

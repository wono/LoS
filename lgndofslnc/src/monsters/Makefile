################################################
#   MAKEFILE
#                                                                   #
#       last modified:  2014/06/09                                  #
#       first wrote:    2014/06/09                                  #
#                                                                   #
#       wono (wonho lim: wono@live.com)                             #
#                                                                   #
#####################################################################

all:
	make compile && make test && make clean

compile:
	javac 	*.java 					\
			tests_monsters/*.java 	\
			Animals/*.java 			\
			Humans/*.java 			\
			-d tests_monsters/bin

test:
	cd tests_monsters/bin && java TestMonsters && cd ../..

clean:
	rm tests_monsters/bin/*


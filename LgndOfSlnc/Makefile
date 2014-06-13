################################################
#   MAKEFILE:
#       LOS - Monsters module testing program                       #
#                                                                   #
#       last modified:  2014/06/12                                  #
#       first wrote:    2014/06/09                                  #
#                                                                   #
#       wono (wonho lim: wono@live.com)                             #
#                                                                   #
#####################################################################

all:
	make compile && make run && make clean

compile:
	javac tests/*.java -sourcepath src/ -d src/
	
run:
	cd src/ && java TestMonsters && cd ..

clean:
	rm src/*.class
	rm src/monsters/*.class
	rm src/monsters/*/*.class


################################################
#   MAKEFILE:
#       LOS - Monsters module testing program                       #
#                                                                   #
#       last modified:  2014/06/14                                  #
#       first wrote:    2014/06/09                                  #
#                                                                   #
#       wono (wonho lim: wono@live.com)                             #
#                                                                   #
#####################################################################

all:
	make test_error_handlers && make test_monsters

test_error_handlers:
#	compile:
	javac tests/TestErrorHandlers.java -sourcepath src/ -d src/
#	run:
	cd src/ && java TestErrorHandlers && cd ..
#	clean:	
	make clean
			
test_monsters:
#   compile:
	javac tests/TestMonsters.java -sourcepath src/ -d src/
#   run:
	cd src/ && java TestMonsters && cd ..
#	clean:
	make clean
	
clean:
	rm src/*.class
	rm src/*/*.class
	rm src/*/*/*.class


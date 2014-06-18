################################################
#   MAKEFILE:
#       LOS - Monsters module testing program                       #
#                                                                   #
#       last modified:  2014/06/18                                  #
#       first wrote:    2014/06/09                                  #
#                                                                   #
#       wono (wonho lim: wono@live.com)                             #
#                                                                   #
#####################################################################

all:
	cd tests && ./runtests hero
	cd tests && ./runtests error_handlers
	cd tests && ./runtests monsters
	make view
	make clean_bin

test_hero:
	cd tests && ./runtests hero && cd ..
	make view
	make clean_bin
	
test_error_handlers:
	cd tests && ./runtests error_handlers && cd ..
	make view	
	make clean_bin

test_monsters:
	cd tests && ./runtests monsters && cd ..
	make view
	make clean_bin

clean:
	rm tests/logs/*
	
clean_bin:
	rm src/*.class
	rm src/*/*.class
	rm src/*/*/*.class

view:
	nano -v tests/logs/*
################################################
#   MAKEFILE:
#       LOS - Monsters module testing program                       #
#                                                                   #
#       last modified:  2014/06/21                                  #
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
	
test_controllers:
	cd tests &&\
	javac TestControllers.java -sourcepath ../src -d ../bin
	cd bin && java TestControllers
	make clean_bin
	
test_hero:
	cd tests && ./runtests hero && cd ..
	make view
	
test_error_handlers:
	cd tests && ./runtests error_handlers && cd ..
	make view	

test_monsters:
	cd tests && ./runtests monsters && cd ..
	make view
	
test_skills:
	cd tests && ./runtests skills && cd ..
	make view
	
clean:
	rm tests/logs/*
	
clean_bin:
	rm -r bin/*
	
view:
	nano -v tests/logs/*

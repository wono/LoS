RUNTEST =   cd tests && ./runtests $(1)

all:
	$(call RUNTEST, error_handlers)
	$(call RUNTEST, hero)
	$(call RUNTEST, items)	
	$(call RUNTEST, maps)	
	$(call RUNTEST, monsters)
	$(call RUNTEST, skills)
	make view
	
simulate:
	$(call RUNTEST, simulate)

test_controllers:
	$(call RUNTEST, controllers)
	
test_error_handlers:
	$(call RUNTEST, error_handlers)

test_hero:
	$(call RUNTEST, hero)

test_items:
	$(call RUNTEST, items)

test_maps:
	$(call RUNTEST, maps)
	
test_monsters:
	$(call RUNTEST, monsters)
	
test_skills:
	$(call RUNTEST, skills)
	
clean:
	rm -fr bin/*
	
clean_log:
	rm -r tests/logs/*
	
view:
	nano -v tests/logs/*

# 👇 This is a rule 👇
# target: dependency-1 dependency-2
# (tab) 	shell lines or recipes
# 👆 This is a rule 👆

help:## help.sh script made by Sebastian Steenssøe, author of "Make your Makefile user-friendly: Create a custom ‘help’ target" Medium article
	./etc/scripts/Makefile/help.sh "$(MAKEFILE_LIST)"

gradlew/help:## gradlew help command
	./gradlew --help

gradlew/clean:## delete content of the build directory
	./gradlew clean

gradlew/build:## build a gradle project
	./gradlew build

gradlew/test:## run all codebase tests
	./gradlew test
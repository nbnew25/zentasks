#!/bin/sh

 if [ -z "$1" ]
 then
	play -Dconfig.resource=application.conf run
 else
	play -Dconfig.resource=application.$1.conf run
 fi

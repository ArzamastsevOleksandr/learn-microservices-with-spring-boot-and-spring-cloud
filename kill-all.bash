#!/usr/bin/env bash

sudo kill $(sudo lsof -t -i:7000) $(sudo lsof -t -i:7001) $(sudo lsof -t -i:7002) $(sudo lsof -t -i:7003)

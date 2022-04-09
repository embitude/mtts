// SPDX-License-Identifier: GPL-2.0+
/*
 * Copyright (c) 2017 Google, Inc
 * Written by Simon Glass <sjg@chromium.org>
 */

#include <common.h>
#include <command.h>
#include <dm.h>
#include <led.h>
#include <dm/uclass-internal.h>

#define LED_TOGGLE LEDST_COUNT

int do_myprint(cmd_tbl_t *cmdtp, int flag, int argc, char * const argv[])
{
	printf("My led called\n");
	return 0;
}

U_BOOT_CMD(
	myprint, 1, 1, do_myprint,
	"Testing the print functionality\n",
	"Print Test\n"
);

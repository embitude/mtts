DESCRIPTION = "Recipe for Test Initscript"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://sysvtest"

inherit update-rc.d

S = "${WORKDIR}"

INITSCRIPT_NAME = "sysvtest"
INITSCRIPT_PARAMS = "start 60 2 3 4 5 . stop 01 0 1 6"

do_install() {
	install -d ${D}${sysconfdir}/init.d
   	install -m 0755 sysvtest ${D}${sysconfdir}/init.d/sysvtest
}


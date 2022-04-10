LICENSE = "CLOSED"
inherit systemd

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "helloworld.service"

SRC_URI_append = " file://helloworld.service "
FILES_${PN} += "${systemd_unitdir}/system/helloworld.service"

do_install_append() {
  install -d ${D}/${systemd_unitdir}/system
  install -m 0644 ${WORKDIR}/helloworld.service ${D}/${systemd_unitdir}/system
}

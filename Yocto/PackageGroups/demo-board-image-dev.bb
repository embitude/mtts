SUMMARY = "MT development image"

inherit core-image
require demo-board-image.bb

IMAGE_FEATURES += "ssh-server-dropbear tools-debug debug-tweaks"

#CORE_IMAGE_EXTRA_INSTALL += "ethtool evtest fbset i2c-tools memtester"
CORE_IMAGE_EXTRA_INSTALL += "packagegroup-mtts-testapps"

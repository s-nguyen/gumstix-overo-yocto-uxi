SUMMARY = "Build extra packages for the package repository"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PACKAGES = "packagegroup-gumstix"

RDEPENDS_packagegroup-gumstix = " \
    ${ROS_INSTALL} \
    bluez-hcidump \
    boost \
    caspa-streaming \
    cheese \
    devmem2 \
    git \
    gstreamer1.0-meta-audio \
    gstreamer1.0-meta-base \
    gstreamer1.0-meta-debug \
    gstreamer1.0-meta-video \
    gstreamer1.0-meta-x11-base \
    i2c-tools \
    librxtx-java \
    mavlink-socket \
    mplayer2 \
    nano \
    omap3-writeprom \
    opencv \
    openjdk-7-jdk \
    packagegroup-core-eclipse-debug \
    packagegroup-core-qt-demoapps \
    packagegroup-core-qt4e \
    packagegroup-core-sdk \
    packagegroup-core-standalone-sdk-target \
    packagegroup-core-tools-debug \
    packagegroup-core-tools-profile \
    packagegroup-core-tools-testapps \
    php \
    php-cgi \
    php-cli \
    picodlp-control \
    python \
    python-pip \
    python-pyserial \
    robovero-examples \
    robovero-python \
    rtklib \
    screen \
    spidev-test \
    sshd \
    uart-loop-test \
    vlc \
"

RDEPENDS_packagegroup-gumstix_append_overo = " \
    omap3-isp-live \
"

ROS_INSTALL = " \
    packagegroup-ros-world \
    python-distutils \
    python-wstool \
"

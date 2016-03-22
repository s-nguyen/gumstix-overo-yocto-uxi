Yocto layer for images and extra recipes for Gumstix products.

This repository is developed in the environment provided by the
[Gumstix Yocto manifest][yocto-manifest] repository.  New code is
developed on the *next* branch corresponding to the *dev* branch of the
manifest and, when appropriate, merged back into the current release
branch called out by the *master* branch of the manifest. Older
releases are tagged by name in the manifest repository and use the
release-specific branches found in this repository.

This repository is discussed on the [Gumstix Mailing List][mailing-list]
and feature-requests/issues can be raised against the top-level
[manifest][yocto-manifest] project.

[yocto-manifest]: https://github.com/gumstix/yocto-manifest
[mailing-list]: https://lists.sourceforge.net/lists/listinfo/gumstix-users

This layer depends on:

URI: git://git.yoctoproject.org/poky.git
branch: fido
revision: 83aa565d93aacae484976562ef1ae8dbbb6b2bc0

URI: git://git.openembedded.org/meta-openembedded.git
branch: fido
revision: 10d3c8f85280a0bf867a8e4f84bcda81c290d28e

URI: git://github.com/gumstix/meta-gumstix.git
branch: fido
revision: 68e4b5771aef2d11fcf04bb8759fecd409de1ac3

URI: git://github.com/bmwcarit/meta-ros.git
branch: master
revision: d465a23c0a96e651419d46b29ab7c0c3663da314

URI: git://git.yoctoproject.org/meta-java.git
branch: master
revision: 66c97ae7461f4c1a13917131787bb76dc34e6b6f

URI: git://git.yoctoproject.org/meta-ti.git
branch: fido
revision: 03cb3ff15f3b8535ca409ce682f44ec1b81da0c3

Layer maintainer: Adam Lee <adam@gumstix.com> for Gumstix, Inc.

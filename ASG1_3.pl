#! /usr/bin/perl

use strict;
use warnings;
use IO::File ;
use IO::Uncompress::Inflate qw(inflate $InflateError) ;

# prepare input file
my $input = new IO::File "<NazrulYusni.bin"
    or die "Cannot open binary: $!\n" ;

# convert input binary data into buffer string
my $buffer ;
inflate $input => \$buffer
    or die "Convert failed: $InflateError\n";

# Set output filename
my $output = new IO::File ">last.txt"
    or die "Cannot open txt file: $!\n";

# write converted data into output file
print $output $buffer;

# output and input files are automatically closed
